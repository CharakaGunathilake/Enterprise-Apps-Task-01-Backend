package edu.iCET.repository.impl;

import edu.iCET.repository.NativeStudentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NativeStudentRepositoryImpl implements NativeStudentRepository {
    final NamedParameterJdbcTemplate namedJdbcTemplate;
    final JdbcTemplate jdbcTemplate;

    @Override
    public Long getRecordCount() {
        return jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM STUDENT",Long.class);
    }
}
