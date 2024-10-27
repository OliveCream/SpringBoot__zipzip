package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatDto {
	
	public enum MessageType{
		ENTER, TALK
	}
	
	private MessageType messageType;	//메세지타입
	private Long chatRoomId;			//채팅방 번호
	private Long senderId;				//보낸 이
	private String msg;					//메세지 내용
}
