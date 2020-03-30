package com.github.pig.admin.service.impl;
import com.baomidou.mybatisplus.mapper.SqlHelper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.mapper.TelRecordMapper;
import com.github.pig.admin.model.dto.CaseDTO;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.mapper.CaseInfoMapper;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.service.ICaseInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
@Service
public class CaseInfoServiceImpl extends ServiceImpl<CaseInfoMapper, CaseInfo> implements ICaseInfoService {
    @Autowired
    private CaseInfoMapper caseInfoMapper;

    @Autowired
    private TelRecordMapper telRecordMapper;

    public boolean inserCaseInfo(CaseInfo caseInfo){
        return SqlHelper.delBool(caseInfoMapper.inserCaseInfo(caseInfo));
    }

    @Override
    public CaseDTO selectCaseDTO(String guid) {
        return caseInfoMapper.selectCaseDTO(guid);
    }

    @Override
    public Page<CaseInfo> selectPageByKey(int page,int limit,String key,int userId, String bankname,String batchno,String ownerid,String batchnoType,String certno,String sort) {
         int current = (page -1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(caseInfoMapper.selectCount(key,userId,bankname,batchno,ownerid,batchnoType,certno));//设置符合条件的所有记录
        pages.setRecords(caseInfoMapper.selectPageByKey(current,limit,key, userId,bankname,batchno,ownerid,batchnoType,certno,sort));

        pages.getPages();//设置最大页数
        return pages;
    }

    @Override
    public Page<CaseInfo> selectPageByName(int page, int limit, String name,int userId) {
        int current = (page -1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(caseInfoMapper.selectCountByName(name,userId));//设置查询的记录总数
        pages.setRecords(caseInfoMapper.selectPageByName(current,limit,name,userId));
        pages.getPages();//设置最大页数
        return pages;
    }

    @Override
    public Page<CaseInfo> selectPageNoKey(int page, int limit,int userId,String bankname,String batchno,String ownerid,String batchnoType,String certno,String sort) {
        int current = (page - 1) * limit;
        System.out.println(userId);
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(caseInfoMapper.selectCountNoKey(userId, bankname,batchno,ownerid,batchnoType,certno));
        pages.setRecords(caseInfoMapper.selectPageNoKey(current,limit,userId, bankname,batchno,ownerid,batchnoType,certno,sort));
        pages.getPages();
        System.out.println(pages);
        System.out.println(pages.getRecords());
        return pages;
    }

    @Override
    public int selectCountbatchNo(String batchNo) {
        return  caseInfoMapper.selectCountbatchNo(batchNo);

    }
/*
修改催收人
 */
    @Override
    public int  updateUser(String id,String ownerId) {

        return caseInfoMapper.updateByUserId(id,ownerId);
    }

    @Override
    public List<CaseInfo> selectCaseInfoAllBank(String certno) {
        return caseInfoMapper.selectCaseInfoAllBank(certno);
    }

    /**
     * 定时更新是否催收
     */
    @Override
    public void timingUpdate() {
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        //获取案件信息集合
        List<CaseInfo> caseInfos = caseInfoMapper.selectList(null);
        //判断集合是否为空
        if(null != caseInfos && !caseInfos.isEmpty()){
            //遍历
            caseInfos.forEach(caseInfo -> {
                //获取最近每个案件信息的一条联系人通过记录
                List<TelRecord> telRecords = telRecordMapper.selectTop1ByTelTime(caseInfo.getGuid());
                //判断集合是否为空
                    if(null != telRecords && !telRecords.isEmpty()){
                        //遍历
                        telRecords.forEach(telRecord -> {
                            System.out.println("--------------------");
                            System.out.println(telRecord.getTeltime());
                            Date date = null;
                            try {
                                date = sdf.parse(telRecord.getTeltime());
                                System.out.println(date);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            //未跟进天数
                            int i = this.differentDaysByMillisecond(new Date(), date);
                            System.out.println(i);
                            caseInfo.setOverdue(String.valueOf(i));
                            //更新案件信息集合
                            caseInfoMapper.updateById(caseInfo);
                        });
                    }else{
                        //未查询通话记录，直接显示2：未催收
                        caseInfo.setOverdue("-1");
                        caseInfoMapper.updateById(caseInfo);
                    }
            });
        }
    }

    /**
     * 通过时间秒毫秒数判断两个时间的间隔
     * @param now
     * @param old
     * @return
     */
    public static int differentDaysByMillisecond(Date now, Date old) {
        //返回当前时间和最近通话时间间隔天数
        return (int) ((now.getTime() - old.getTime()) / (1000*3600*24));
    }

    private Page<CaseInfo> buildPage(int page ,int limit){
        Page<CaseInfo> pages = new Page<>();
        pages.setCurrent(page);
        pages.setSize(limit);//设置获取最大记录数
        return pages;
    }
}
