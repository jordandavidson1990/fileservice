package com.codeclan.example.fileSystem.repositories;

import com.codeclan.example.fileSystem.models.File;
import com.codeclan.example.fileSystem.projections.EmbedFileToFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface FileRepository extends JpaRepository<File, Long> {
}
