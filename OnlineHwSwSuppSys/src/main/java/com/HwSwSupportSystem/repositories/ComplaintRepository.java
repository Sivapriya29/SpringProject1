package com.HwSwSupportSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HwSwSupportSystem.beans.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer>{

}
