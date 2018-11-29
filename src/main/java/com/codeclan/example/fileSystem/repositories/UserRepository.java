package com.codeclan.example.fileSystem.repositories;

import com.codeclan.example.fileSystem.models.User;
import com.codeclan.example.fileSystem.projections.EmbedFolderToUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolderToUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}

