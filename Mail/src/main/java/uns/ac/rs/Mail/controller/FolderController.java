package uns.ac.rs.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

//    @Autowired
//    AccountService accountService;

    @GetMapping(value="/all")
    public ResponseEntity<List<FolderDTO>> getFolders(){
        List<Folder> folders = folderService.findAll();
        List<FolderDTO> foldersDTO = new ArrayList<FolderDTO>();
        for (Folder f : folders) {
            foldersDTO.add(new FolderDTO(f));
        }
        return new ResponseEntity<List<FolderDTO>>(foldersDTO, HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<FolderDTO> getFolder(@PathVariable("id") Long id) {
        Folder folder = folderService.findOne(id);
        if (folder == null) {
            return new ResponseEntity<FolderDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<FolderDTO>(new FolderDTO(folder), HttpStatus.OK);
    }

    @PostMapping(value="/add", consumes="application/json")
    public ResponseEntity<FolderDTO> saveFolder(@RequestBody FolderDTO folderDTO) {
        Folder folder = new Folder();

        folder.setName(folderDTO.getName());
        folder.setDestination(folderDTO.getDestination());
        folder.setParentFolder(folderDTO.getParentFolder());

        folder = folderService.save(folder);
        return new ResponseEntity<FolderDTO>(new FolderDTO(folder), HttpStatus.CREATED);
    }

    @PutMapping(value="/update/{id}", consumes="application/json")
    public ResponseEntity<FolderDTO> updateFolder(@RequestBody FolderDTO folderDTO, @PathVariable("id") Long id) {
        Folder folder = new Folder();

        if (folder == null) {
            return new ResponseEntity<FolderDTO>(HttpStatus.NOT_FOUND);
        }

        folder.setName(folderDTO.getName());
        folder.setDestination(folderDTO.getDestination());
        folder.setParentFolder(folderDTO.getParentFolder());

        folder = folderService.save(folder);
        return new ResponseEntity<FolderDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<Void> deleteFolder(@PathVariable Long id) {
        Folder folder = folderService.findOne(id);
        if (folder != null) {
            folderService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}