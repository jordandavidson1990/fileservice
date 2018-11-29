package com.codeclan.example.fileSystem.components;

import com.codeclan.example.fileSystem.models.File;
import com.codeclan.example.fileSystem.models.Folder;
import com.codeclan.example.fileSystem.models.User;
import com.codeclan.example.fileSystem.repositories.FileRepository;
import com.codeclan.example.fileSystem.repositories.FolderRepository;
import com.codeclan.example.fileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {
        User user = new User("Jordan");
        userRepository.save(user);
        Folder folder = new Folder("data", user);
        folderRepository.save(folder);
        File file = new File("document", ".js", 10, folder);
        fileRepository.save(file);

        user.addFolder(folder);
        folder.addFile(file);
    }
}
