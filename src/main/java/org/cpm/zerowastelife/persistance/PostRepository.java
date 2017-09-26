package org.cpm.zerowastelife.persistance;

import org.cpm.zerowastelife.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PostRepository extends JpaRepository<Post, Long>{

	public Post findById(int id);
	
	@Transactional
	public int deleteById(int id);
}
