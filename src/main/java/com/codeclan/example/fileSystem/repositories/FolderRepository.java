package com.codeclan.example.fileSystem.repositories;

import com.codeclan.example.fileSystem.models.Folder;
import com.codeclan.example.fileSystem.projections.EmbedFileToFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFileToFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
