package com.mysite.sbb3.repository;

import com.mysite.sbb3.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser,Long> { //기본 키 값 형식을 적음, long id이므로 long작성
}
