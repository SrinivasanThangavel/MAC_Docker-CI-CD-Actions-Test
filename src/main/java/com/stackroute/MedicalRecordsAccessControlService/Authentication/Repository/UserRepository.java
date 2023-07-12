// CREATE User repository interface and annotate it with @Repository annotation.
// and extend JpaRepository and use User as the type and String as the id.

// Path: src/main/java/com/stackroute/MedicalRecordsAccessControlService/Authentication/Repository/UserRepository.java
// Compare this snippet from src/main/java/com/stackroute/MedicalRecordsAccessControlService/Authentication/Repository/UserRepository.java:
package com.stackroute.MedicalRecordsAccessControlService.Authentication.Repository;

import com.stackroute.MedicalRecordsAccessControlService.Authentication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}