package ru.netology.domain;

public class Comments {
    private int count;// количество комментариев;
    private String canPost;//может ли текущий пользователь комментировать запись
    private String  signerID; // ИД пользователя который оставил запись
    private String signerImage;// фото пользователя который оставил запись
}
