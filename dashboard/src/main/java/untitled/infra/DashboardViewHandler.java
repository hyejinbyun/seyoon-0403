package untitled.infra;

import untitled.domain.*;
import untitled.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DashboardViewHandler {

    @Autowired
    private DashboardRepository dashboardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUpload_then_CREATE_1 (@Payload FileUpload fileUpload) {
        try {

            if (!fileUpload.validate()) return;

            // view 객체 생성
            Dashboard dashboard = new Dashboard();
            // view 객체에 이벤트의 Value 를 set 함
            dashboard.setId(fileUpload.getId());
            dashboard.setSize(fileUpload.getSize());
            dashboard.setName(fileUpload.getName());
            dashboard.setPath(fileUpload.getPath());
            // view 레파지 토리에 save
            dashboardRepository.save(dashboard);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_CREATE_ (@Payload  ) {
        try {

            if (!.validate()) return;

            // view 객체 생성
            Dashboard dashboard = new Dashboard();
            // view 객체에 이벤트의 Value 를 set 함
            dashboard.set();
            // view 레파지 토리에 save
            dashboardRepository.save(dashboard);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_UPDATE_(@Payload  ) {
        try {
            if (!.validate()) return;
                // view 객체 조회
            Optional<Dashboard> dashboardOptional = dashboardRepository.findById(.getId());

            if( dashboardOptional.isPresent()) {
                 Dashboard dashboard = dashboardOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                dashboard.set();    
                // view 레파지 토리에 save
                 dashboardRepository.save(dashboard);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenVideoProcessed_then_UPDATE_2(@Payload VideoProcessed videoProcessed) {
        try {
            if (!videoProcessed.validate()) return;
                // view 객체 조회

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

