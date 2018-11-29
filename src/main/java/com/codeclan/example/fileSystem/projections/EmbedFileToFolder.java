package com.codeclan.example.fileSystem.projections;

import com.codeclan.example.fileSystem.models.File;
import com.codeclan.example.fileSystem.models.Folder;
import com.codeclan.example.fileSystem.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFileToFolder", types = Folder.class)
public interface EmbedFileToFolder {
    String getTitle();
    User getUser();
}
