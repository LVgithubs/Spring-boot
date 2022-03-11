package site.metacoding.dbproject.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    // @Query(value = "SELECT * FROM post ", nativeQuery = true)
    

}
