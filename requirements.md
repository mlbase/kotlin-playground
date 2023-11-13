# Requirements
Book Domain
---
- 책(Book)에는 저자(Author)가 존재한다.
- 책은 외부 api 검색을 위해 isbn 으로 조회 할 수 있다.
- 출판사(Publishing Company)에 경우는  사업자 등록번호(BusinessNumber)를 필요로 한다.
- 재고(Inventory)의 경우 북 domain 에서 관리한다.
- 가격(Price)은 책 aggregate root 에서 관리된다.
- 환율(Currency Rate)의 경우 실시간으로 변하지만 이 프로젝트에 한해서는 고정환율을 적용한다.

order domain
---
- 주문(Order) 에는 장바구니(Wish)가 존재한다.
- 주문라인(OrderLine) 역시 존재한다.
- 장바구니라인(WishLine) 역시 존재한다.
- 가격(Price)은 책 고유정보로도 존재하지만 할인 정책(Discount Policy)에 의한 가격(Discount Price)도 존재한다.
- 가격은 책 도메인의 책임이고, 할인가격은 주문 도메인의 책임이다.
