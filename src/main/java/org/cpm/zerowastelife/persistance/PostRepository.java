package org.cpm.zerowastelife.persistance;

import org.cpm.zerowastelife.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>{

	
}
