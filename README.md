# Google Solution Challenge(Eung-ae Team)

<p align="center">
  
  ![지구를 (1)](https://user-images.githubusercontent.com/86887824/229299725-e2b25ec8-8acb-4de0-bcd6-44a2080d6f17.png)
  
  https://user-images.githubusercontent.com/86887824/229303506-9abcd988-75c8-42c8-b75a-881bed6ad26f.mp4
</p>



## 프로젝트 소개

<p align="justify">
프로젝트 개요/동기
</p>

<p align="center">
  
  우리 프로젝트는 환경을 지키기 위한 챌린지를 여는 것을 제일 큰 목적으로 하고 있습니다.

  그렇다고 챌린지만 있는 것이 아닌 환경에 대한 뉴스, 팁 그리고 자유게시판까지 갖추고 있는 복합 커뮤니티입니다.

  회원 기능은 구글 로그인으로 구현을 했습니다.

  환경 보전 챌린지에 대한 카테고리로는 일회용품 줄이기, 쓰레기 줍기, 대중교통 타기 등이 될 수 있습니다. 

  각 챌린지에 대한 포스팅으로 회원의 경험치가 올라가게 되고 그 경험치에 대한 등급 변경 등은 현재 개발 중에 있습니다.

  또한 각 챌린지에 회원들이 직접 평가할 수 있는 요소로 좋아요를 넣었고 그 수에 따라 챌린지를 완수한 것으로 평가하여 회원의 경험치를 올려주는 기능도 구현 중에 있습니다.

  회원 레벨에 따른 상위 10명을 우측 명예의 전당에 등록할 것이고 그런 요소를 통해 이 챌린지에 동기부여를 하게 만들 것 입니다.

  뉴스 카테고리에는 전 세계의 환경 문제에 대한 이슈를 관리자와 회원들이 자유롭게 올리고 대화할 수 있는 공간으로 만들었습니다.

  팁 카테고리는 분리수거에 관한 유용한 정보 등을 담게되는 장소가 될 것입니다. 이 또한 마찬가지로 관리자와 회원들이 자유롭게 서로 알고 있는 정보를 공유하게 될 것입니다.

  그리고 모든 게시물에는 조회수가 존재하여 현재 상위에 있는 조회수 게시글은 우측에 따로 표시를 하여 사람들의 접근성을 더욱 활성화 시켰습니다.
</p>

<br>

## 기술 스택

### Application and Data
|  Java   |  MySQL   |  NGINX   |  Spring Boot  |  GCP   |
|:-------:|:--------:|:--------:|:-------------:|:------:|
| ![java] | ![mysql] | ![nginx] | ![springboot] | ![gcp] |

---
### DevOps
|  Github   |  Git   |  Intellij   | Docker & Docker-compose |
|:---------:|:------:|:-----------:|:-----------------------:|
| ![github] | ![git] | ![intellij] |        ![docker]        |

---
### Business Tools
|  Slack   |  Notion   |
|:--------:|:---------:|
| ![slack] | ![notion] |

---
<br>

## 구현 기능

### 게시글
- CRUD
- MultipartFile 이용한 사진 업로드
- 조회수

### 카테고리
- CRUD

### 댓글
- CRUD
- Member 연결

### 좋아요
- Member 연결
- 동일 Member가 누를시 -1

### Member
- Session Login 방식을 이용한 Google Login
- 각종 기능에 연결
- Level

### Swagger 연결

---

## API

[Swagger UI.pdf](https://github.com/jsw6701/waffle-eungae-backend/files/11130070/Swagger.UI.pdf)


## 팀원

Frontend : Jade, Lucy

Frontend URI : https://github.com/GDSC-Daejin/waffle-eungae-frontend

Backend : Glenn(본인), Nox

---

## 역할

### Glenn
- ERD 작성
- 카테고리
- 사진 포함한 게시글, 조회수
- 댓글
- 좋아요 에러 수정
- 스웨거 연결
- 로그인 대상 정보 조회 API
- 프론트가 요청한 API들 구현

- Docker, Docker-compose 이용한 프로젝트 설정 => 배포는 실패

### Nox
- Session 로그인 구현
- 좋아요 구현
- GCP 사용한 배포

<br>

## Error 사항 해결

- 페이징처리 SwaggerConfig 수정
- MultipartFile API 오류 해결 (MediaType 추가, @RequestBody -> MultipartFile을 넣은 DTO @ModelAttribute)
- @LoginUser -> @ApiIgnore 추가하여 오류 해결
- GCP SQL 연결쪽 IP 추가
- Long 타입 Null 값 DTO에 값 세팅
- 로그인 세션 local에서는 잘 돌아가는데 배포에서는 Session이 넘어가지지 않는 오류(samesite, secure, httponly 설정)
- Docker-compose 이용한 프로젝트 실행(배포전까지 프론트에게 API 사용할 수 있게 해줌)

<br>


<br>

## 아쉬운 점

<p align="justify">
  - 유저 레벨 기능은 만들었지만 프론트측에서 보여주는 기능 개발 못함

  - 유저 레벨별 명칭 연결 못함

  - Docker-compose 이용한 GCP 배포를 이루려 했으나 실패
</p>

<br>

## 라이센스

MIT &copy; [NoHack](mailto:lbjp114@gmail.com)

<!-- Stack Icon Refernces -->

[springboot]: /icon/springboot.svg
[java]: /icon/java.svg
[mysql]: /icon/mysql.svg
[nginx]: /icon/nginx.svg
[gcp]: /icon/gcp.svg
[github]: /icon/github.svg
[git]: /icon/git.svg
[docker]: /icon/docker.svg
[intellij]: /icon/intellij.svg
[slack]: /icon/slack.svg
[notion]: /icon/notion.svg