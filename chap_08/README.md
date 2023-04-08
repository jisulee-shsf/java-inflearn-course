####
## 추상 클래스와 인터페이스
####
#### ► [_01_AbstractClass_230406]
- 클래스 · 메서드에서 미완성의 의미를 가진 키워드 abstract 실습
- (1) 추상: 구체적인 표상이나 개념에서 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 정신 작용
- (2) 추상화: 자손 클래스의 공통부분을 뽑아 조상 클래스를 만드는 것
- (3) 추상 클래스: 클래스 내에 추상 메서드가 선언되어 있음을 의미하는 클래스
- (4) 추상 메서드: 선언부만 작성하고 구현부는 작성하지 않은 미완성의 메서드
- 💡 메서드를 미완성으로 남겨두는 이유는 상속받는 클래스에 따라 메서드의 내용이 달라질 수 있기 때문이다.
- 💡 추상 클래스는 아직 완성되지 않은 메서드가 존재하는 미완성 설계도이므로, 클래스로부터 인스턴스를 생성할 수 없다.
- 💡 자손 클래스는 오버라이딩을 통해 조상 클래스의 추상 메서드를 모두 구현해야 한다. 
####