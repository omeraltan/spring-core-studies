package com.spring.studies.wiring;

/**
 *
 *      @Autowired  : org.springframework.beans.factory.annotation
 *      The behaviour of the @Autowired annotation is similar to the @Inject annotation.
 *      The only difference is that the @Autowired annotation is part of the Spring framework.
 *      1.Match by Name
 *      2.Match by Type
 *      3.Match by Qualifier
 *
 *      @Inject     : javax.inject.Inject
 *      The @Inject annotation belongs to the JSR-330 annotations collection.
 *      This annotation has the following execution paths, listed by precedence:
 *      1.Match by Name
 *      2.Match by Type
 *      3.Match by Qualifier
 *
 *      @Resource   : javax.annotation.Resource
 *      This annotation has the following execution paths, listed by precedence:
 *      1.Match by Name
 *      2.Match by Type
 *      3.Match by Qualifier
 *      These execution paths are applicable to both "setter" and "field" injection.
 *
 */

