package com.example.jdbc.demo.service;

//import com.example.jdbc.demo.model.Jabatan;
import com.example.jdbc.demo.model.JabatanResult;

import java.util.List;

public interface JabatanService {
    List<JabatanResult> getAll();
    JabatanResult getJabatanByIdJabatan(int id_jabatan);
}
