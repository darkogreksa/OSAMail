package uns.ac.rs.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uns.ac.rs.Mail.dto.FolderDTO;
import uns.ac.rs.Mail.entity.Folder;
import uns.ac.rs.Mail.service.impl.AccountService;
import uns.ac.rs.Mail.service.impl.FolderService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="api/folders")
public class FolderController {

    @Autowired
    FolderService folderService;

    @Autowired
    AccountService accountService;

    @GetMapping(value="/all")
    public ResponseEntity<List<FolderDTO>> getFolders(){
        List<Folder> folders = folderService.findAll();
        List<FolderDTO> foldersDTO = new ArrayList<FolderDTO>();
        for (Folder f : folders) {
            foldersDTO.add(new FolderDTO(f));
        }
        return new ResponseEntity<List<FolderDTO>>(foldersDTO, HttpStatus.OK);
    }

//    @GetMapping(value="/folder/{id}")
//    public ResponseEntity<List<FolderDTO>> getFolderByAccount(@PathVariable("id") Integer id){
//        List<Folder> folders = folderService.findByAccount(accountService.findOne(id));
//        List<FolderDTO> folderDTO = new ArrayList<FolderDTO>();
//        for (Folder f : folders) {
//            folderDTO.add(new FolderDTO(f));
//        }
//        return new ResponseEntity<List<FolderDTO>>(folderDTO, HttpStatus.OK);
//    }

}