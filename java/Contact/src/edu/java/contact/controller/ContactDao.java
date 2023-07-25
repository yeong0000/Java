package edu.java.contact.controller;

import java.util.List;

import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 Controller 역할의 인터페이스
// CRUD(Create-insert, Read-select, Update, Delete) 작업을 DB에서.
public interface ContactDao {
    
    /**
     * 연락처 전체 검색.
     * DB contacts 테이블에 저장된 모든 연락처 정보를 검색.
     * 
     * @return Contact 타입을 원소로 갖는 List.
     */
    List<Contact> read();
    
    /**
     * DB contacts 테이블에서 primary key로 연락처 정보를 검색. 
     * 
     * @param cid 검색할 primary key.
     * @return cid가 존재하면 Contact 타입 객체를 리턴. cid가 없으면 null을 리턴.
     */
    Contact read(Integer cid);
    
    /**
     * 연락처 정보를 DB의 contact 테이블에 insert.
     * 
     * @param contact 저장할 이름(name), 전화번호(phone), 이메일(email) 정보를 가지고 있는 객체.
     * @return DB 테이블에 삽입된 행의 개수.
     */
    int create(Contact contact);
    
    /**
     * primary key에 해당하는 연락처 정보를 수정(업데이트).
     * 
     * @param contact 수정할 연락처의 PK(cid), 업데이트할 이름, 전화번호, 이메일 정보를 저장한 객체.
     * @return DB 테이블에서 업데이트된 행의 개수.
     */
    int update(Contact contact);
    
    /**
     * Primary key(cid)에 해당하는 연락처 정보를 DB 테이블에서 삭제.
     * 
     * @param cid 삭제할 연락처의 PK.
     * @return 삭제된 행의 개수.
     */
    int delete(Integer cid);

}
