# BoardCrud
스프링 vuejs 게시판 

- optional 설명.
https://www.daleseo.com/java8-optional-after/ 

- JPA Entity 매핑 방법.
https://gmlwjd9405.github.io/2019/08/11/entity-mapping.html

vuejs 전역컴포넌트 지역컴포넌트
https://cigiko.cafe24.com/vue-js-%EB%B7%B0-%EC%BB%B4%ED%8F%AC%EB%84%8C%ED%8A%B8/

예제
https://okky.kr/article/442679

@ModelAttribute, @RequestParam, @RequestBody, request.getParameter(), request.getAttribute() 차이 설명
https://kimyhcj.tistory.com/m/259?category=537761


스프링부트 VUE 연동 방법
https://deockstory.tistory.com/26


JPQL 
https://data-make.tistory.com/614

axios 로 data를 담아 controller로 전송
https://pickhada.tistory.com/20

vue axios 통신
https://goddino.tistory.com/89

스프링부트 파일업로드
https://kyuhyuk.kr/article/spring-boot/2020/07/22/Spring-Boot-JPA-MySQL-Board-Post-File-Upload-Download




@Springbootaplication 
-@Springbootaplication은 3가지의 기능이 합쳐져 있다.
	1.SpringbootConfiguration - 현재 클래스가 Spring의 설정 파일임을 알려주는 어노테이션
	2.Componentscan - 현재 패키지 이하에서 @Component(@Controller , @Service , @Repository 등) 어노테이션이 붙어 있는 클래스를 찾아서 빈으로 등록하는 역할.
	3.EnableAutoConfiguration - 미리 정의되어 있는 빈들을 가져와 등록 , 클래스 패스 세팅 , 어플리케이션에 추가된 설정들을 자동추가


@Restcontroller
-Controller + ResponseBody 
기존 Controller 어노테이션의 Return 값에 Responsebody를 적용한 것으로 json 반환.
기존의 Controller는 View(화면)을 리턴, json 형태의 데이터를 반환할때 @ResponseBody를 추가해야 했는데 이러한 기능을 통합.


@Controller , @Service , @Repository 
@Contoller 어노테이션을 붙이면 핸들러가 스캔할 수 있는 빈(Bean) 객체가 되어 서블릿용 컨테이너에 생성됩니다. 
마찬가지로 @Repository, @service 어노테이션은 해당 클래스를 루트 컨테이너에 빈(Bean) 객체로 생성해주는 어노테이션입니다.

컨트롤러 : @Controller (프레젠테이션 레이어, 웹 요청과 응답을 처리함)
로직 처리 : @Service (서비스 레이어, 내부에서 자바 로직을 처리함)
외부I/O 처리 : @Repository (퍼시스턴스 레이어, DB나 파일같은 외부 I/O 작업을 처리함)

@Transactional
데이터베이스의 상태를 변경하는 작업 또는 한번에 수행되어야 하는 연산들을 의미한다.
begin, commit 을 자동으로 수행해준다.
예외 발생 시 rollback 처리를 자동으로 수행해준다.

@RequestMapping
요청 URL을 어떤 method가 처리할지 mapping해주는 Annotation이다.
Controller 어노테이션이 클래스 위에 선언되었다면 RequestMapping은 클래스 내의 메서드 위에도 선언될 수 있다. 요청된 URL을 어떤 매서드가 처리할지 결정하는 어노테이션이다.


@Getmapping 
HTTP GET 요청을 특정 핸들러 메소드에 맵핑하기위한 annotation.
주소에 파라미터가 노출 됨.

@Autowired
속성(field), setter method, constructor(생성자)에서 사용하며 Type에 따라 알아서 Bean을 주입 해준다.

Optional<T>
Optional는 “존재할 수도 있지만 안 할 수도 있는 객체”, 즉, “null이 될 수도 있는 객체”을 감싸고 있는 일종의 래퍼 클래스입니다
직접 다루기에 위험하고 까다로운 null을 담을 수 있는 특수한 그릇

Optional.empty()
null을 담고 있는, 한 마디로 비어있는 Optional 객체를 얻어옵니다. 이 비어있는 객체는 Optional 내부적으로 미리 생성해놓은 싱글턴 인스턴스입니다.

Optional.of(value)
null이 아닌 객체를 담고 있는 Optional 객체를 생성합니다. null이 넘어올 경우, NPE를 던지기 때문에 주의해서 사용해야 합니다.

Optional.ofNullable(value)
null인지 아닌지 확신할 수 없는 객체를 담고 있는 Optional 객체를 생성합니다. Optional.empty()와 Optional.ofNullable(value)를 합쳐놓은 메소드

Stream()
저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자입니다




