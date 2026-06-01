package kopo.poly.service;

import kopo.poly.dto.OcrDTO;

public interface IOcrService {

    // 학습 모델 파일이 존재하는 폴더
    String modelFile = "C:/model/tessdata";

    // 이미지 파일로부터 문자 읽어 오기
    OcrDTO getReadforImageText(OcrDTO pDTO) throws Exception;
}
