package memo;

public class Memo {

	/*@소프트웨어 테스트 정의 및 설명
	-소프트웨어 테스트 정의: 시스템이나 시스템의 구성 요소 또는 SW 프로그램을
	실행하고 평가하는 과정

	@테스트의 목적
	-개발된 결과물을 검증 및 확인하여 최종 사용자에게 안정적이고 성능이 뛰어난 
	소프트웨어를 제공하는 것
	
	@테스트 활동
	최종 사용자에게 제공되기 전에 제품의 결함을 찾는 모든 활동을 포함
	소프트웨어의 정확성, 완성도, 성능을 테스트 및 측정하여 지표를 제공하는 작업
	***테스트는 프로젝트 전반에 걸쳐서 수행됨
	
	@소프트웨어 테스트 절차
	테스트 계획 -> 테스트 설계 -> 테스트 데이터 생성 -> TestCase 작성 -> 테스트 수행
	테스트 결과 점검
	
	@소프트웨어 생명주기
	요구사항 분석(Analysis) -> 설계(Design) -> 구현(Coding) 
	-> 테스트 -> 유지보수(Maintenance)
	
	소프트웨어 생명주기 종류
	1. 폭포수 모델
	특징:
	소프트웨어 개발의 각 단계가 순차적으로 진행
	각 단계 종료 후 다음 단계 진행
	단순하거나 응용 분야를 잘 알고 있는 경우 적합한 모델
	단점:
	소프트웨어의 요구사항이 초기에 명확하게 정의되기 어려움
	소프트웨어가 개발 후반부에 구체화됨
	중요한 문제점들이 뒤늦게 발견됨
	
	-단계
	계획 수립 -> 요구사항 분석 -> 설계 -> 구현 -> 테스트 -> 유지보수
	
	2.프로토타이핑 모델
	특징:
	요구사항이 초기에 결정되면 개발단계에서 유지보수가 일어남
	요구사항이 불분명한 경우 유용한 모델
	단점:
	고객은 시제품을 통해 구현된 기능을 확인 가능함
	품질에 대한 확인의 어려움
	시제품 작동을 데모하기 위해 적절하지 않은 프로그래밍 언어 및 비효율적인 
	알고리즘이 사용되는 경우가 많음
	
	-단계
	요구사항 수집 -> 프로토타입 설계 -> 프로토타입 개발 -> 
	고객 평가 -> 프로토타입 정제 -> 요구사항 수집 -> 무한반복...
	
	@테스트 주도 개발(Test Driven Development)
	-정의
	테스트를 기반으로 개발을 진행하는 개발방법론
	1999년도 애자일 기반의 개발 방법론이 나왔을 때 소개됨
	핵심: 테스트 먼저 개발(Test-First Development)
	사견 *일반적으로 좋은 회사들이라고 하는 곳은 거의 도입하여 활용*
	
	@기존 개발 방법론
	기능 구현 후 테스트 케이스 작성
	
	설계 -> 구현 -> 테스트
	
	@TDD
	테스트 케이스 작성 후 기능 구현
	
	설계 -> 테스트 케이스 작성 -> 구현
	
	-기능을 작은 Unit 단위로 분리하여 테스트 케이스 작성
	-간결한 소프트웨어 디자인 유도
	-객체지향 코드 구현에 도움
	
	@테스트 케이스 개발 절차
	테스트 추가 -> 테스트 수행 -> 새로운 테스트는 무조건 실패되도록 구현
	-> 코드 작성 -> 테스트 수행 -> 모든 테스트 성공할 때까지 수행
	-> 코드 리팩토링 -> 반복*/
	
//	????????????
//	@테스트 주도 개발 절차별 세부사항
//	1.테스트 추가
//	추가되는 기능에 대해 구현에 앞서 테스트 케이스 작성
//	테스트 케이스로 작성되는 기능: 유닛 테스트 정도의 작은 기능
//	테스트 케이스를 작성하는 개발자: 기능에 대한 상세 요구사항 파악
//	테스트 케이스 작성: jUnit과 같은 유닛 테스트 툴 활용
//	
//	2.테스트 수행
//	추가한 테스트 케이스를 포함하여 유닛 테스트 수행
//	새롭게 추가된 테스트 케이스의 결과: 실패(fail)
//	새롭게 추가된 테스트 케이스에 대한 코드
//	-> 구현되지 않았기 때문에 실패하는 것은 당연함
//	추가된 테스트 케이스만 실패
//	-> 개발자에게 구현 및 테스트에 대한 확신을 줌
//	
//	3.코드 작성
//	테스트 케이스 실패 원인이 된 코드를 작성하는 단계
//	테스트 케이스 이외의 코드 작성 금지
//	목표: 테스트 케이스의 결과가 성공(Pass)할 수준의 코드 작성
//	리팩토링 단계: 코드 개선 기회
//	
//	4.테스트 수행
//	테스트 케이스를 다시 한번 수행
//	목표: 추가된 테스트 케이스 및 모든 테스트 케이스 통과(Pass)
//	모두 통과 시
//	-> 개발자: 구현사항이 요구사항을 만족하는 것을 확신 가능
//	-> 새롭게 추가한 코드가 부작용을 일으키지 않았다는 것을 확인 가능
//	테스트 케이스가 통과하지 않는 경우
//	-> 투가된 코드에 문제 있음 -> 수정 필요
//	수정 후 이 단계를 다시 수행
//	
//	5.코드 리팩토링
//	리팩토링 후에 지속적으로 테스트 케이스 실행
//	모든 테스트 케이스 통과시
//	-> 리팩토링이 기존 기능을 변형시키지 않았음을 확인 가능
//	
//	6.반복
//	요구사항의 새로운 기능 구현 -> 1번 단계부터 반복하여 수행
//	각 단계의 수행: 간결하게 유지
//	기능을 작은 단위로 쪼개서 수시로 반영
//	테스트 주도 개발 절차 수행
//	
//	@TDD 방법론의 장점
//	엄청나게 많지만 
//	애자일 개발 방법론에서 적용하여 운영 용이
//	애자일 개발: 개발 이외의 다른 업무를 최소화하는 개발 방법론
//	디버깅 시간의 단축등이 있다
//	
//	단점:
//	도입에 대한 진입 장벽
//	외부 연동 테스트 진행 시 어려움
//	개발자의 역량에 따라 품질 좌우 등등
	
	
//	@Test
//	특정 기능을 수행하는 부분을 테스트 하는 방법
//	@Test안에 테스트 메서드를 만듬
//	실제 업무 클래스를 생성 -> 로직은 실패해야 함
//	실패한 코드를 확인 후 기능이 돌아가는 코드를 구현함
//	테스트 동작 수행(성공할 때 까지 위 내용 반복)
//	성공했는데 리팩토링이 필요하면 수행
//	위 단계들을 계속 수행
//	
//	@jUnit 동작 준비 단계
//	초기화 -> 테스트 케이스 작성 -> 단위 테스트 수행
//	
//	@테스트 케이스 작성에서 체크 방법
//	fail -> 잘못된 메시지 트리거
//	assertTrue -> 결과가 true/false인 경우
//	assertEquals -> 결과가 같은 경우
//	assertNull -> obj가 null인 경우
//	assertSame -> 객체 값 비교
//	등등 
//	
	
	
//	조건문?
//	테스트 드리븐 완벽할 순 없다
	
	
//	설계 테스트 기법
	
//	범위
	
//	경계 값 분석
//	boundary value	
		
//	입력 조건의 중간 값 보다는 경계 값에 오류(error)가 발생할 확률이 경험적으로
//	높다는 점을 감안하여 테스트 케이스를 설계하는 방법
//	
//	ex: 1~100까지의 임의의 숫자
//	
//	1, 100   통과하면 성공으로 치자
		
	
//	0,1,2, 99,100,101	
//	숫자에서 +-1씩은 하자	
		
		
		
		
	
}
