<p align="center">
  <img src="https://github.com/user-attachments/assets/38674967-c705-4e82-a8c1-4df67e4276df" width="55%">
</p>

## 🖥️ N빵의 정석
모임 비용을 정확하게 정산하기 희망하는 모임원을 위한 Android APP

<br>

## 🧑‍💻 참여 인원
|  <img src="https://github.com/user-attachments/assets/9bbe9e79-04b6-44b1-a68c-eae5a049c2ad" width="100" height="100">  |
|:---:|
| 김태훈 |
| Android|

<br>

## 🗓️ 개발 기간
2024.10 ~ 2025.01

<br>

## 📁 프로젝트 상세 설명
정산을 진행할 인원을 선택한 후, 모임으로 발생한 영수증과 상세 품목을 APP에 입력합니다. 이후 계산기에 상세 품목이 나오면 N분의 1을 진행할 인원들의 버튼을 눌러 정산을 진행합니다. 정산이 완료된 후 정산 내역을 공유하여 정산 비용 청구할 수 있습니다.

  (1) 인원 선택 화면  
  <img src="https://github.com/user-attachments/assets/41283618-0740-4a47-9c16-651900a0c748" width="30%">  
  ‘+, - 버튼’을 통해 정산을 진행할 인원을 선택할 수 있습니다. 2 ~ 8명 사이의 인원을 선택할 수 있습니다. 인원 선택 후 ‘시작하기’버튼을 눌러 영수증 및 상세 상품을 입력할 수 있는 화면으로 이동할 수 있습니다.  

  (2) 영수증 및 상세 상품 입력 화면  
  <img src="https://github.com/user-attachments/assets/06ed35c6-4b03-47ec-a9f7-83ea9745c16b" width="30%">  
  ‘영수증 추가’버튼을 통해 영수증을 추가할 수 있으며, ‘영수증 펼치기’와 ‘영수증 접기’버튼을 눌러 추가한 영수증을 확장 혹은 축소할 수 있습니다. 영수증이 확장된 상태에서 ‘상품 추가’버튼을 눌러 상품을 추가할 수 있습니다. 영수증 이름을 누르거나 상세 상품을 누르면 상태를 업데이트하거나 삭제할 수 있습니다. 입력을 모두 마쳤다면 ‘정산 시작’버튼을 눌러 다음 화면으로 이동합니다.  

  (3) 정산 화면  
  <img src="https://github.com/user-attachments/assets/b0322165-06a3-4cfd-b2cf-3418ceb3d85f" width="30%">  
  ‘ON/OFF’버튼을 통해 이름 변경 모드를 활성화/비활성화하여 좌측의 정산 인원들의 버튼 이름을 변경할 수 있습니다. 화면 상단에 나오는 상품과 가격을 보고 N분의 1을 진행하고자 하는 인원들을 선택한 후 ‘적용’버튼을 누르게 되면 해당 인원들에게 정산이 적용됩니다. ‘전체 선택’을 누르게 되면 모든 인원이 선택됩니다. ‘적용’버튼을 눌러 잘못된 정산을 적용했다면 ‘되돌리기’버튼을 눌러 이전으로 되돌릴 수 있습니다. 모든 정산이 끝나면 ‘정산 완료’버튼을 누르라는 Toast Message가 나오며 ‘정산 완료’버튼을 누르면 다음 화면으로 이동됩니다.  

  (4) 정산 내역 확인 화면  
  <img src="https://github.com/user-attachments/assets/fb954c7f-e12b-4572-8268-971af1bc5c9b" width="30%">  
  각 인원의 이름이 적힌 버튼을 눌러 상세 정산 내역을 확인할 수 있습니다. ‘계좌 입력’ Text를 누르면 계좌를 입력할 수 있습니다. ‘저장 & 공유’버튼을 누르게 되면 현재 정산 화면이 이미지로 갤러리에 저장되고, 다른 외부 APP에 이미지를 공유할 수 있습니다.

<br>

## ✏️ 배운 내용
- Jetpack Compose를 사용해 선언형 UI 프로그래밍을 통해 APP 개발의 효율성을 극대화
- MVVM + Clean Architecutre 구조를 도입하여 APP 개발의 유지보수성 및 확장성을 확보
- Dialog를 Custom 후 사용하여 원하는 형태의 Dialog를 만들 수 있었고, 이를 통해 입력받은 데이터를 UI에 적용
- Hilt를 사용하여 ViewModel에 의존성 주입을 적용하였고, 생명주기 관린와 의존성 처리를 효율적으로 개선

<br>

## 🛠️ 사용 기술
[![My Skills](https://skillicons.dev/icons?i=androidstudio,kotlin)](https://skillicons.dev)
