# java-tutorials
★ Git Tutorials

Version Control System 기능
backup
recovery
collaboration
*CVS, SVN >> git처럼 버전관리시스템

*user/estelle/hellogit

1.설치

https://git-scm.com 운영체제 64비트에 맞는 다운로드 실행

pc에 설치된 git bash 를 이용해서 리눅스언어로 프로그래밍 가능.

https://codeonweb.com 에서 git 설치없이 실습 가능
Git Init 외 명령어 for beginners
<git bash 명령어>la

$ pwd : 현재 나의 디렉토리 위치를 알려줌 $ cd 폴더명 : 해당 폴더로 이동 $ cd .. > 상위 디렉토리로 이동 $ 폴더명 : 현 위치에서 입력한 이름의 폴더 생성 $ ls -al : 현재 디렉토리의 파일목록을 보여줌 (띄어쓰기 주의)

$ mkdir 디렉토리명 > 디렉토리 생성 $ git remote add origin 깃헙리파지토리주소 > 원격저장소에 origin 저장소 만든다 (origin: 로컬저장소와 연결된 저장소) $ git remote -v > 원격저장소 상세보기 $ git remote --help > 명령어 도움말 $ git remote remove 저장소이름 > 저장소 삭제 $ git push -u origin master

로컬에서 원격저장소로 origin 저장소의 master브랜치로 작업 푸쉬하기(보내기) 깃 username, password > 푸쉬진행. $ git push -u origin > 이미 로컬과 원격저장소의 master 브랜치를 연동시켰기에.. $ git clone 주소 . > 깃에서 현재 디렉토리로 복제...( . > 현재 디렉토리)

$ git init > 해당 디렉토리를 버전관리하겠다 선언 $ vim f1.txt > vim이라는 프로그램으로 f1.txt 파일을 생성/편집하겠다

i (insert) > 입력기능
esc버튼 > 해당 기능 종료
: > 입력내용 저장 ? (입력시 화면 하단에 보여짐)
wq (wright, quit) + enter버튼 > vim을 종료하고, 명령어 입력 화면으로 돌아옴
$ cat f1.txt > f1.txt 파일에 저장된 내용 보기

$ git status > git init된 파일의 버전관리 여부/상태 확인 untracked files: 버전관리 아직 시작 안했네 .. $ git add > 이 파일을 버전관리 실행(git에 이 파일을 추적하라 명령) $ git status 입력해서 확인해보면, Changes to be committed.

$ git config --global user. name 이름 $ git config --global user.email 이메일주소

$ git commit > commit message 입력 화면 (vim 실행) > i (insert mode) > 1 입력 (version1) > esc button (i mode 종료) > : wq 입력 + enter버튼 (입력내용 저장 및 vim 종료)

$ git log > 버전 상태 확인 (1 확인/ 버전관리 history 확인)

$ vim f1.txt > 버전을 2로 바꿈 (i, 2로 수정, esc, :wq) $ git status > 버전관리 상태 확인 (modified: f1.txt > 붉은 글씨) $ git add f1.txt > (수정된) 파일을 추적하라 $ git status > 버전관리 상태 확인 (modified: f1.txt > 녹색 글씨) $ git commit > commit message 작성화면 (vim 실행) > message 입력/수정 후 vim 종료 $ git log > 버전 상태 확인 (2 확인)

** f2.txt 파일 만들고 commit 해보아라.

$ cp f1.txt f2.txt > copy한다(f1.txt와 똑같은 f2.txt 파일을 만든다)

** 왜 commit 전에 add를 하는가 ?

git bash된 폴더 내에서 commit할 파일만 선택하는 것이 add 원하는 파일만 골라서 commit하기 위해 add를 먼저하고 commit

**stage area : commit 대기 상태

처음 add한 파일이 stage상태로 들어간다 이후 해당 파일을 add하면, commit할 파일로 선택되는 것

$ git log -p : commit간 소스 차이 확인

q : 되돌아가기

commit e71ccbce269730181fb87010caf532c1136f9f7b (해당 commit의 고유한 id)

$ git log commit id (붙여넣기) > 해당 commit 이전의 history만 보여짐

$ git diff id..id > 해당 id의 commit간의 차이 보기

*** 이전 버전으로 돌아가기 ! (commit 취소하기)

$ git reset id of ver3 --hard > ver3 상태로 초기화 (이후 ver 취소 / 추후 복구 가능) > soft 등 다른 명령도 있음

$ git revert >> ??

$ git commit --help > commit message에 대한 도움말 보기

$ git commit id -a > 해당 파일이 수정되었을 때 자동으로 add 시킨다 > add 과정 없이 바로 commit message 창으로

$ git commit -am "msg" > commit msg 창 켜지 않고, 자동 add + "msg" 커밋

** 자주 쓰는 Git Bash Command(명령어) 순위 (Google 검색빈도 순)

$ git commit $ git push $ git pull $ git clone $ git checkout $ git add $ git branch $ git log $ git diff $ git fetch $ git merge

How does Git work ? (Git의 원리)
*** .git 디렉토리에서 일어나는 일

Gistory

설치 : gttps://www.python.ord 에서 다운로드 (git bash에서 바로 설치 가능 > pip install gistory)
$ gistory > 브라우저에서 http://localhost + 0000 (:0000의 숫자 4개)
ctrl+c > gistory 종료
Gistory에서 .git 디렉토리의 활동 확인

최근 변경된 파일이 가장 위에 표시 (새로운 파일 추가에 대해서는 표시X)
git add 후 파일 표시 > index 파일, objects/78/.. (object 디렉토리내 78번째 파일) > 변경된 파일명은 index에서 확인 가능 > 파일의 변경된 내용은 objects/78/.. 에서 확인 가능 * object : 객체
****** Make branches

$ git branch > 브랜치 현황 보기 > * master > 현재 브랜치 이름은 master 이다. $ git branch 이름 > $ git checkout 이름 > 해당 브랜치로

$ clear > 화면 clear

$ git log --branches --decorate > 디렉토리 내 모든 branch log 보기 (-- 옵션) q > 나가기

$ git log --branches --decorate --graph

브랜치간 상태를 그래프로 나타냄 (언제 분기되어/어디까지 관리됐는지)

$ git log --branches --decorate --graph --oneline

한 줄로 보기

$ stree > 현 디렉토리가 소스트리(GUI)로 나타남 (버전관리 상태가 나타남)

$ git log 1..2 > 1과 2 브랜치간 차이 보기 (1에는 없고 2에는 있는 것 보기)

$ git diff 1..2 > 각 브랜치의 현상태 비교

$ git merge 2 > 현 체크아웃 브랜치에서 2 브랜치를 합병해온다

$ git branch -d 2 > (현 체크아웃 브랜치를 두고) 2 브랜치를 삭제

https://git-scm.com / documentation > progit 북 (오픈라이센스) > 명령어 확인 가능
$ git checkout -b 3 > 3 브랜치 (긴급브랜치라고 가정) 만들고, 체크아웃한다

Fast-forwad (빨리감기) > 마스터 브랜치 + 긴급브랜치 병합 (별도의 커밋 생성X) $ git branch -d 3 > 긴급 브랜치 삭제

recursive > 마스터 브랜치에 변화가 생겼을 때, Fast-forward 불가 > 공통 조상 커밋을 두고, 합쳐진 새로운 커밋 생성 !

동일파일 각 브랜치에서 커밋 후 합병시, 충돌 ... > 파일 내에서 각 브랜치의 내용 모두 자동으로 합쳐버림
*** 오픈소스를 내 디렉토리로 가져오기

$ git clone 주소 디렉토리명 > gitsrc로 소스 복제중..

$ git log --reverse > 깃의 로그를 최초순으로 본다

$ git checkout 커밋아이디 >

**** 깃헙 저장소 동기화/백업하기

$ git commit --amend > commit msg or 추가add한 내용 개정한다

$ git push > 깃 저장소에 푸시됨 !

$ git pull > 깃 저장소에 푸시된 내용들을 로컬저장소로 가져옴 !


★ Java Grammars

5/16

 * OOP (Object Oriented Programming, 객체 지향 프로그래밍)
    부품 객체를 먼저 만들고 이것들을 (필요할 때마다) 하나씩 조립해 완성된 프로그램을 만드는 기법
    -> OOP 언어 : C++, JAVA
 * Object(객체) -> 클래스 안에 속성(=필드), 메소드(=함수) 만들어놓고 ..

 * 캡슐화 : 외부의 잘못된 사용으로 객체가 손상되지 않도록, 클래스 내용을 감춘다. (필요한 것만 알려줌)
    -> 접근제한자(Access Modifier) 사용 (public, private, protected, default)

 * 상속 : 클래스 복사는 public 속성과 메소드만 쓸 수 있기 때문에,
    클래스 통째로 상속받아온다(B class extends A).. like 부모님 재산 다 내꺼

 * 다형성(Polymorphism) : 같은 타입이지만 실행 결과가 다양한 객체를 대입할 수 있는 성질 .. ?
    부모 타입에는 모든 자식객체가 대입
    인터페이스 타입에는 타입 모든 구현 객체가 대입

 * 인스턴스화(instance) -> Scanner sc = new Scanner 에서 객체변수 sc(객체 instance)

 * 식별자 작성 규칙
    1) 하나 이상의 문자
    2) 첫글자 숫자 X, 빈칸 X
    3) $ _ 외의 특수문자 사용 불가
    4) 자바 키워드 사용 불가 (ex) int for.. )
    5) 대소문자 구분 .!
    첫 글자와 연결된 다른 단어 첫글자는 대문자로 .. (관례) ChatClient

 * 한 파일 내에서도 선언한 클래스 개수만큼 .class 파일 생성 (javac.exe 컴파일 -> .class)
    -> public class는 파일명과 동일한 클래스만 가능 !

 * new 연산자 : 객체 생성 (클래스 복사도 해오고 ..)
    new Scanner();

 * 생성자(Constructor) : Scanner();

 * 클래스 변수 = new 클래스();    -> 변수: 클래스 복사본 이름..

 * 클래스의 용도

   1) 라이브러리(API: Application Program Interface) 용도
    -> 다른 클래스에서 이용할 목적으로 만든 클래스 (자체실행X)
   2) 실행용
    -> main() 메소드 있는 클래스에서 실행할 목적으로 만든 클래스.

 * 클래스의 구성멤버
   
	①필드(속성)      -> 객체(class)의 데이터 저장
	②생성자          -> 객체(class) 생성시 초기화 역할 담당 ..?
	③메소드(함수)    -> 객체(class)의 동작

 * boolean : 저장 값이 참 or 거짓인 논리형

 * 필드 초기값

   1) 정수
    byte 0
    char \u0000 (빈 공백)
    short 0
    int 0
    long 0L

2) 실수
/////////////////////////////////

 * 오버로딩 (Function Overloding)

	함수(메소드) 이름은 동일하나 인자(매개변수)의 타입 및 개수가 다름


 * 인스턴스 멤버 선언 vs 정적 멤버 서언 기준

    public class Cal {
	    String color;
	    stataic double pi = 3.111;
	    // 공용작업시 모두가 아는 내용은 후에 객체생성 귀찮으니까 바로쓸 수 있도록 static 멤버 선언
    }

 * 싱글톤

 * import   -> 다른 패키지에서 클래스 호출할 때 ! import java.util.Scanner;

 * Annotation -> 프로그램에 추가정보 제공 .. 컴파일러 한테 ! (metadata) // 사람에게는 주석 !
