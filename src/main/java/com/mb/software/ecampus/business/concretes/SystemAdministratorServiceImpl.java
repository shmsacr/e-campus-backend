package com.mb.software.ecampus.business.concretes;

import com.mb.software.ecampus.business.abstracts.SystemAdministratorService;
import com.mb.software.ecampus.core.utilities.results.Result;
import com.mb.software.ecampus.core.utilities.results.SuccessResult;
import com.mb.software.ecampus.core.utilities.results.data.DataResult;
import com.mb.software.ecampus.core.utilities.results.data.SuccessDataResult;
import com.mb.software.ecampus.dataAccess.dao.SystemAdministratorDao;
import com.mb.software.ecampus.entities.concretes.SystemAdministrator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SystemAdministratorServiceImpl implements SystemAdministratorService {

    private final SystemAdministratorDao systemAdministratorDao;

    @Autowired
    public SystemAdministratorServiceImpl(SystemAdministratorDao systemAdministratorDao) {
        this.systemAdministratorDao = systemAdministratorDao;
    }

    @Override
    public DataResult<SystemAdministrator> add(SystemAdministrator entity) {
        return new SuccessDataResult<>(systemAdministratorDao.save(entity));
    }

    @Override
    public DataResult<SystemAdministrator> update(SystemAdministrator entity) {
        return new SuccessDataResult<>(systemAdministratorDao.save(entity));
    }

    @Override
    public Result delete(int id) {
        systemAdministratorDao.deleteById(id);
        return new SuccessResult("System Administrator has been deleted");
    }

    @Override
    public DataResult<SystemAdministrator> getById(int id) {
        return new SuccessDataResult<>(systemAdministratorDao.findById(id).get());
    }

    @Override
    public DataResult<List<SystemAdministrator>> getAll() {
        return new SuccessDataResult<>(systemAdministratorDao.findAll());
    }
}
