package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        List<Person> result = jdbcTemplate.query(
                "SELECT * FROM person",
                (rs, rowNum) -> new Person(rs.getInt("person_id"),
                        rs.getString("person_name"), rs.getString("surname"),
                        rs.getString("gender"), rs.getInt("age"), rs.getString("phone_number"))
        );

        return result;
    }

    public void save(Person person) {
        jdbcTemplate.update(
                "INSERT INTO Person VALUES (?, ?, ?, ?, ?, ?)", person.getId(), person.getPersonName(),
                person.getPersonLastName(), person.getPersonGender(), person.getPersonAge(), person.getPersonPhoneNumber());
    }

    public void delete(Person person) {
        jdbcTemplate.update("DELETE FROM person WHERE person_id = ?", person.getId());
    }

}
