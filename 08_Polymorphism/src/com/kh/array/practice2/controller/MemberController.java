package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {

	private Member[] mArr = new Member[3];
	public int count = 0;

	public void insertMember(Member m) {
		// 객체 배열에 객체 하나씩 추가한다고 생각
		// count를 인덱스라고 생각

//		mArr[count++] = new Member(m.getId(),m.getName(),m.getPassword(),m.getEmail(),m.getGender(),m.getAge());
		mArr[count++] = m;
	}

	public boolean updateMember(String id, String name, String password, String eamil) {

		// checkId 활용<== index
		// 추가처럼 수정도 같은 방식 해당 인덱스 값에 넣는 방식
		// setter 이용
		int index = this.checkId(id);
		if(index!=-1) {
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(eamil);
			return true;
		
//			mArr[this.checkId(id)].setId(id);
//			mArr[this.checkId(id)].setName(name);
//			mArr[this.checkId(id)].setPassword(password);
//			mArr[this.checkId(id)].setEmail(eamil);
		}		
		return false;
	}

	
	

	public int checkId(String id) {// id 검색
		// 객체 배열 값들 for문 돌려서 일치한지 확인후 return값으로 넘김
		// mArr[]this.checkId(id);

		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i]!=null && mArr[i].getId().equals(id)) {
				return i;

			}

		}

		return -1;

	}

	public Member[] printAll() {

		return mArr;
	}
}
