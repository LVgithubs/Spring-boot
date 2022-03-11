package site.level.march_test.hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRespository extends JpaRepository<Hospital, Integer> {

    // @Query(value = "SELECT * FROM hospital", nativeQuery = true)
    // User mLogin(@Param("username") String username, @Param("password") String
    // password);

    // findAll()
    // SELECT * FROM user;

    // findById()
    // SELECT * FROM user WHERE id = ?

    // save()
    // INSERT INTO user(username, password, email, createDate) VALUES(?,?,?,?)

    // deleteById()
    // DELETE FROM user WHERE id = ?

    // update는 없어요!! - 영속성 컨텍스트 공부하면 사용할 수 있음.
}
