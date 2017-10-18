package com.taotao.service;

import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chunsoft on 2017/9/17.
 */
public interface PictureService {
    Map uploadFile(MultipartFile uploadFile);
}
