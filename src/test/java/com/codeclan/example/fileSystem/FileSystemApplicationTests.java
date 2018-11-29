package com.codeclan.example.fileSystem;

import com.codeclan.example.fileSystem.models.File;
import com.codeclan.example.fileSystem.models.Folder;
import com.codeclan.example.fileSystem.models.User;
import com.codeclan.example.fileSystem.repositories.FileRepository;
import com.codeclan.example.fileSystem.repositories.FolderRepository;
import com.codeclan.example.fileSystem.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileSystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolderAndUser() {
		User user = new User("Jordan");
		userRepository.save(user);
		Folder folder = new Folder("data", user);
		folderRepository.save(folder);
		File file = new File("document", ".js", 10, folder);
		fileRepository.save(file);
	}
}
