DequeTest - 배열로 구현한 덱. size(), frontRemove()에 오류 발생. 
DequeTest_2 - 위 코드의 문제점 극복. (다만 한 가지 아쉬운 부분이 있다. 맨 처음 인덱스부터 시작하도록 설정하여 초반 frontPush에는 어려움이 있을 수 있다) + 좀 더 정확한 예외처리
DequeTest_3 - 최종본.
DequeTest_4 - 링크드리스트로 구현한 덱 (생각해보니 문제가 있다. 첫 데이터가 들어올때 그 데이터를 기준으로 잡았기 때문에 remove를 할 경우 그 데이터의 다음 데이터로는 이동하지 못한다)
-> 한 마디로 단방향 링크드리스트의 한계. 따라서 더블 링크드리스트를 사용해야함
DequeTest_5 - 위의 문제 해결후 완성본. 링크드리스트 덱
