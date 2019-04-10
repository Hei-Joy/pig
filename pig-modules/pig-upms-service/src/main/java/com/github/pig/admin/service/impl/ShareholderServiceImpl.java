package com.github.pig.admin.service.impl;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.mapper.ShareholderMapper;
import com.github.pig.admin.model.entity.Shareholder;
import com.github.pig.admin.service.ShareholderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 46275 on 2018/12/24.
 */
@Slf4j
@Service
@AllArgsConstructor
public class ShareholderServiceImpl extends ServiceImpl<ShareholderMapper,Shareholder> implements ShareholderService {
    @Autowired  private ShareholderMapper shareholderMapper;

    @Override
    public boolean insertShareholder(Shareholder shareholder) {
        shareholderMapper.insertShareholder(shareholder);
        return Boolean.TRUE;
    }

    @Override
    public boolean updateShareholder(Shareholder shareholder) {
        shareholderMapper.updateShareholder(shareholder);
        return Boolean.TRUE;
    }

    @Override
    public boolean deleteShareholder(String id) {
        shareholderMapper.deleteShareholder(id);
        return Boolean.TRUE;
    }

    @Override
    public Shareholder findShareholderById(String id) {
        Shareholder shareholder = null;
        if (id != null){
            shareholder = shareholderMapper.findShareholderById(id);
        }
        return shareholder;
    }
}
