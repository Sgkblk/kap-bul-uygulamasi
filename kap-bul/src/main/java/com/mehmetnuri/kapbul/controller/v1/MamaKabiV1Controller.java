package com.mehmetnuri.kapbul.controller.v1;

import com.mehmetnuri.kapbul.entity.MamaKabi;
import com.mehmetnuri.kapbul.service.MamaKabiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/mamakabi")
public class MamaKabiV1Controller {
    private final MamaKabiService service;
    public MamaKabiV1Controller(MamaKabiService service) {
        this.service = service;
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<MamaKabi>> findAll() {
        return service.findAll();
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<MamaKabi> findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
