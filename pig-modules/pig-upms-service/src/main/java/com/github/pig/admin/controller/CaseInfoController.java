package com.github.pig.admin.controller;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.dto.CaseDTO;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.model.entity.SysUser;
import com.github.pig.admin.model.entity.UserInfo;
import com.github.pig.admin.service.IUserInfoService;
import com.github.pig.admin.service.SysUserService;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.UserUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.R;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.service.ICaseInfoService;
import com.github.pig.common.web.BaseController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
@RestController
@RequestMapping("/caseInfo")
public class CaseInfoController extends BaseController {
    @Autowired private ICaseInfoService caseInfoService;
    @Autowired private SysUserService  sysuserService;

//    @GetMapping("/{id}")
//    public R<CaseInfo> get(@PathVariable String id) {
//        CaseInfo caseInfo = caseInfoService.selectById(id);
//        return new R<>(caseInfo);
//    }
    /**
     * 通过ID查询
     *
     * @param id
     * @return CaseInfo
     */
    @GetMapping("/{id}")
    public R<CaseDTO> get(@PathVariable String id){
        CaseDTO caseDTO = caseInfoService.selectCaseDTO(id);
        return new R<>(caseDTO);
    }


//    /**
//    * 根据银行名字查询信息
//    *
//    * @param params 分页对象
//    * @return 分页对象
//    */
//    @RequestMapping("/pageByBankName")
//    public Page pageByBankName(@RequestParam Map<String, Object> params, String name) {
//        params.remove("name");
//        EntityWrapper<CaseInfo> wrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(name)){
//            wrapper.like("bankname",name);
//        }
//        return caseInfoService.selectPage(new Query<>(params), wrapper);
//    }

    /**
     * 分页查询信息
     * @param page  页数
     * @param limit 最大记录数
     * @param key   关键词
     * @return
     */
    @RequestMapping("/page")
    public Page<CaseInfo> page(int page, int limit,String key,String bankname,String batchno,String ownerid,String isMine,String batchnoType,String certno ,String sort){


        if("1".equals(isMine)){
            ownerid = UserUtils.getUser();
        }

        if(StringUtils.isBlank(key)){
            return caseInfoService.selectPageNoKey(page,limit,this.getUserId(),bankname,batchno,ownerid,batchnoType,certno,sort);
        }
        return  caseInfoService.selectPageByKey(page,limit,key,this.getUserId(),bankname,batchno,ownerid,batchnoType,certno,sort);
    }


    /**
     * 根据批次查询
     * 根据cid查询
     * @return
     */

    @RequestMapping("/pageByBatch")
    public Page pageByBatch(int page, int limit,String batchno,String distribution){

        return caseInfoService.selectPage(new Page<CaseInfo>(page,limit)
                ,new EntityWrapper<CaseInfo>()
                        .eq("status",distribution)
                        .eq("batchno",batchno));
    }


    @PostMapping("/distributionCase")
    public Page distributionCase(@RequestBody CaseInfo caseInfo1){
        String batchNo = caseInfo1.getBatchno();

        //每人多少案件

        //按照部门
        String deptId = caseInfo1.getDeptname();

        List<SysUser> userlist = sysuserService.selectList(new EntityWrapper<SysUser>());
        List<CaseInfo> caseInfos = caseInfoService.selectList(new EntityWrapper<CaseInfo>()
               // .eq("status",0)
                .eq("batchno",batchNo));

        if(StringUtils.isNotEmpty(deptId)){
            userlist = sysuserService.selectList(new EntityWrapper<SysUser>().eq("dept_id",deptId));

        }
       int caseCount = caseInfos.size();
       int userCount = userlist.size();
        if(caseCount==0) {
            return null;
        }
        //如果人数大于案件数 每人不够分
        int perCase = caseCount/userCount;


        if(caseCount < userCount){
            for( int j=0;j<= caseCount;j++ ){
                SysUser user = userlist.get(j);
                CaseInfo caseInfo =caseInfos.get(j);
                caseInfo.setOwnerid(user.getUsername());
                caseInfo.setStatus("1");
                caseInfoService.updateById(caseInfo);
            }
            return null;
        }

        int c=0;
        for (int i=0;i<=userCount;i++){
            SysUser user=   userlist.get(i);

         for( int j=0;j<=perCase&&c<caseCount;j++ ){
             CaseInfo caseInfo =caseInfos.get(c);
             caseInfo.setOwnerid(user.getUsername());
             caseInfo.setStatus("1");
             caseInfoService.updateById(caseInfo);
             c++;
         }

        }
        return null;
    }




    /**
     * 根据名字字段分页查询信息
     * @param page
     * @param limit
     * @param name
     * @return
     */
    @RequestMapping("/pageByName")
    public Page<CaseInfo> pageByName(int page, int limit, String name){
        return caseInfoService.selectPageByName(page,limit,name,this.getUserId());
    }

    /**
     * 添加
     * @param  caseInfo  实体
     * @return success/false
     */
    @PostMapping("/add")
    public R<Boolean> add(@RequestBody CaseInfo caseInfo) {
        caseInfo.setGuid(Tool.getUUid());//设置主键id
        caseInfo.setInputtime(Tool.getDate());//设置存入日期
        return new R<>(caseInfoService.inserCaseInfo(caseInfo));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable String id) {
        CaseInfo caseInfo = new CaseInfo();
        caseInfo.setGuid(id);
       // caseInfo.setUpdateTime(new Date());
        //caseInfo.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(caseInfoService.updateById(caseInfo));
    }

    /**
     * 编辑
     * @param  caseInfo  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody CaseInfo caseInfo) {
       // caseInfo.setUpdateTime(new Date());
        return new R<>(caseInfoService.updateById(caseInfo));
    }
    @GetMapping("/updateOwnerId")
    public  int updateOwnerId(String id,String ownerId){
System.out.println(!id.equals(null)+""+!ownerId.equals(null));
        if(id!=" "&ownerId!=" "){
            return caseInfoService.updateUser(id,ownerId);
        }
        return 0;
    }

//    @PostMapping
//    public void exportCaseInfo(String bankname,HttpServletResponse response) {
//         XSSFWorkbook book = new XSSFWorkbook();
//        try {
//            List<UserParam> list = indexService.exportUser(condition);
//            if (list != null && list.size() > 0) {
//                XSSFSheet sheet = book.createSheet("mySheent");
//                String[] vals = {"用户ID", "邮箱账号", "昵称", "年龄", "性别", "状态", "注册时间"};
//                createExcel(sheet, 0, vals);
//                for (int i = 0; i < list.size(); i++) {
//                    UserParam entity = list.get(i);
//                    String[] vals2 = new String[]{String.valueOf(entity.getId()), entity.getEmail(), entity.getName(), String.valueOf(entity.getAge()),
//                            entity.getSex() == 0 ? "女" : "男", entity.getRemoved() == 0 ? "启用" : "禁用", entity.getRegisterDate()};
//                    createExcel(sheet, i + 1, vals2);
//                }
//
//                book.write(generateResponseExcel("用户列表", response));
//            }
//            book.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @GetMapping("/selectCaseInfoAllBank")
    public List<CaseInfo> selectCaseInfoAllBank(String certno){
        return caseInfoService.selectCaseInfoAllBank(certno);
    }
}
