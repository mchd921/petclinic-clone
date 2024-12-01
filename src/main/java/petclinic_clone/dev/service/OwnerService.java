package petclinic_clone.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import petclinic_clone.dev.model.Owner;
import petclinic_clone.dev.repository.OwnerRepository;

@Service
@Transactional
public class OwnerService {
    
    @Autowired
    OwnerRepository repository;

    /**
     * データベースからOwnerの一覧を取得する
     * @return
     */
    public List<Owner> findAll() {
        return repository.findAll();
    }
}
