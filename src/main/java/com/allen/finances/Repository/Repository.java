package com.allen.finances.Repository

import org.springframework.data.jpa.repository.JpaRepository;
import com.allen.finances.Model.Expenses;
import org.springframework.stereotype.Repository;

@Repository
public interface Finances extends JpaRepository<Finances, Long> {
}