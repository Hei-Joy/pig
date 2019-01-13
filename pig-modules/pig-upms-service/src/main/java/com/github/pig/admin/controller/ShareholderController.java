package com.github.pig.admin.controller;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.entity.Shareholder;
import com.github.pig.admin.service.ShareholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 46275 on 2018/12/24.
 */
@RestController
@RequestMapping("/shareholder")
public class ShareholderController {

    @Autowired
    private ShareholderService shareholderService;

    /**
     * 根据id查询股东
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Shareholder shareholder(@PathVariable String id){
        return shareholderService.findShareholderById(id);
    }

    /**
     * 添加股东
     * @param shareholder
     * @return
     */
    @PostMapping("/insert")
    public boolean insertShareholder(Shareholder shareholder){
        shareholder.setId(Tool.getUUid());//使用工具类生成uuid
        return shareholderService.insertShareholder(shareholder);
    }

    /**
     * 更新股东
     * @param shareholder
     * @return
     */
    @PostMapping("/update")
    public boolean updateShareholder(Shareholder shareholder){
        return shareholderService.updateShareholder(shareholder);
    }

    @PostMapping("/delete")
    public boolean deleteShareholder(String id){
        return shareholderService.deleteShareholder(id);
    }
}
