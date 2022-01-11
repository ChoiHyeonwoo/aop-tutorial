package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    //hello.aop.order 하위 패키지
    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder(){} // pointcut signature -> 포인트 컷을 여러군데 사용가능하다.

    //클래스 이름 패턴이 *Service 인 경우
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){} // pointcut signature -> 포인트 컷을 여러군데 사용가능하다.

    @Pointcut("allOrder() && allService()")
    public void orderAndService(){}

}
