select*from emp;
select*from dept;
select*from salgrade;

select e.ename , e.sal, s.grade
from EMP e, SALGRADE s
where e.sal between s.losal and s.hisal;

//집계함수 여러행으로 부터 하나의 결과값
select ename, sal from emp;
select ename, avg(sal) from emp;
select ename, round(avg(sal),2) from emp;
//row 개수가 다른 경우 안됨

select job from emp;
select count(distinct job) from emp;
//중복제거 distinct

select sal, deptno
from emp
order by deptno;

select deptno, sum(sal), max(sal), min(sal), round(avg(sal),2),count(sal)
from emp
group by deptno;
//group by에 참여한 colum은 select에 사용 가능

select deptno, job from emp;

select emp.deptno,dname,  sum(sal), max(sal), min(sal), round(avg(sal),2),count(sal)
from emp,deptno
where emp.deptno = dept.deptno
group by emp.deptno, dname
order by deptno; 
//where 절은 group by 앞


select deptno, job, count(*)
from emp
group by deptno, job
order by deptno;


select avg(sal) from emp;
select round(avg(sal),2) from emp;
select max(avg(sal)) from emp;


select max(avg(sal)) 
from emp
group by deptno; 


select deptno, max(avg(sal)) 
from emp
group by deptno; X



subquery

/// 사원중 ford 보다 급여가 많은 사원 목록

select * 
from emp
where ename = 'FORD';

select *
from emp
where sal >= 3000;

select*
from emp
where sal > (select sal from emp where ename = 'FORD');


select deptno, count(ename)
from emp
where sal >= 2000
group by deptno;
//2000이하는 그룹핑에 참여하지 않음


select deptno, sum(sal), count(*)
from emp
where job <> 'CLERK' 
group by deptno
having sum(sal) >=6500;




select ename, sal, deptno, job
from emp
where ename in (select min(ename) from emp group by deptno)


select ename, sal, deptno, job
from emp
where sal in (select min(sal) from emp group by deptno)
order by deptno

// in 연산자 다항의 변수

select deptno, avg(sal)
from emp
group by deptno
having avg(sal) = (select max(avg(sal)) from emp group by deptno) 

select ename, deptno, job,  sal
from emp o
where sal >(select avg(sal) from emp where deptno = o.deptno)
***




select rownum empno, ename, sal
from emp
order by sal
*****


5. 자신의 부서 평균 급여보다 연봉이 작은 사원의 사번(employee_id), 성(last_name)과 연봉(salary)을 조회하시오.
Select e.employee_id, e.last_name, e.salary
From employees e , departments d
Where e.salary<=( select avg(salary) from employees e , departments d where e.department_id
 = d.department_id) 
And e.department_id= d.department_id
//모든 부서에 대해서 영향이 갈 수 있기 때문에 다시 조건을 지정









