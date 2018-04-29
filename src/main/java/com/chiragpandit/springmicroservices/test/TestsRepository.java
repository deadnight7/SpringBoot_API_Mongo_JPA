package com.chiragpandit.springmicroservices.test;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestsRepository extends MongoRepository<Test, String>
{

}
