package com.codeclan.example.fileSystem.projections;

import com.codeclan.example.fileSystem.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolderToUser", types = User.class)
public interface EmbedFolderToUser {
    String getName();
}
