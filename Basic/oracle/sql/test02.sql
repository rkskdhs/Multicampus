
drop table book;  /테이블 삭제

create table book( 
	bookid number (5) CONSTRAINT PK_book primary key,
	title varchar2(50),
	author varchar2(10),
	price number(5),
	pubdate date);

	
	DROP TABLE member_basic CASCADE CONSTRAINTS PURGE;



	
select *from book
insert into book values(1,'java','홍길동','12/02/02');
insert into book values(1,'sql', '고길동', '12/02/02');
insert into book values(1,'Database', '최길동', '12/02/02');
insert into book values(1,'spring', '김길동', '12/02/02');

//rollback의 여지가 없음

DDL-> rollback의 여지가 없음




create table book( 
	bookno number (5) CONSTRAINT PK_book primary key,
	isbn varchar2(10) CONSTRAINT unique_book_isbn unique,
	title varchar2(50),
	price number(5)check(price>0),
	pubdate date default sysdate
	);
	//unique null허용
	//제약조건
	
	insert into book values(seq_bookid.nextval,null,'1111-5555','spring', 700, '12/02/05');
	insert into book values(1,'1215-5445','spring', 500, '12/02/05');
	insert into book values(1,null, 'spring', 500, '12/02/05');
	insert into book values(1,null, 'spring', 500, sysdate);
	
	insert into book (bookid,title,price) values(5,'java',1990);
	
	update book set title = 'java' where bookid= 1;
	
	
	
	
	
	select * from emp where dept = 30;
	
	create table emp30 as select * from emp where deptno = 30;
	//기존에 있는 테이블을 기반으로 만드는 테이블 as
	
	
	
	view // 데이터 보안, 숨기기

	
	create or replace view emp_dept
	as
	select e.ename, m.ename, d.dname
	from emp e , emp m , dept d
	where e.mgr= m.empno and e.deptno = d.deptno;
	
	
	//sequence 자동 번호 생성
	
	create sequence seq_bookid
	start with 1 increment by 1cache 20;
	
	select seq_bookid.nextval from dual;
	select seq_bookid.currentval from dual;
	
	
	
	
	