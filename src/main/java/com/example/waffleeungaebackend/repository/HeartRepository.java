package com.example.waffleeungaebackend.repository;

import com.example.waffleeungaebackend.entity.HeartPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface HeartRepository extends JpaRepository<HeartPost, Integer> {

    @Modifying
    @Query(value = "INSERT INTO like_post(post_id, member_Id) VALUES(?1, ?2)", nativeQuery = true)
    int mSave(Long post_id, Long member_Id) ;

    @Modifying
    @Query(value = "DELETE FROM likes WHERE post_id = ?1 AND member_Id = ?2", nativeQuery = true)
    int mDelete(Long post_id, Long member_Id);

}
