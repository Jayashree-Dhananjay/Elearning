package com.cg.mentorservice.service.impl;

import com.cg.mentorservice.dto.APIResponseDto;
import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.dto.UserDto;
import com.cg.mentorservice.entity.Mentor;
import com.cg.mentorservice.mapper.MentorMapper;
import com.cg.mentorservice.repository.MentorRepository;
import com.cg.mentorservice.service.APIClient;
import com.cg.mentorservice.service.MentorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService{
    private MentorRepository mentorRepository;
//    private WebClient webClient;
//    private APIClient apiClient;

    @Override
    public MentorDto saveMentor(MentorDto mentorDto) {

        // convert mentor dto to mentor jpa entity
        Mentor mentor = MentorMapper.mapToMentor(mentorDto);

        Mentor savedMentor = mentorRepository.save(mentor);

        MentorDto savedMentorDto = MentorMapper.mapToMentorDto(savedMentor);


        return savedMentorDto;
    }
    @Override
    public MentorDto getByMentorId(Long id) {
        Mentor mentor = mentorRepository.findByMentorId(id);

        MentorDto departmentDto = MentorMapper.mapToMentorDto(mentor);

        return departmentDto;
    }

    @Override
    public List<MentorDto> getAllMentors() {
        List<Mentor> mentors = mentorRepository.findAll();
        return mentors.stream().map(MentorMapper::mapToMentorDto).collect(Collectors.toList());

    }

//    @Override
//    public APIResponseDto getBYMentorId(Long mentorId) {
//
//
//        Mentor mentor = mentorRepository.findByMentorId(mentorId);
//
//        UserDto userDto = webClient.get()
//                .uri("http://localhost:8081/api/users/" + mentor.getMentorId())
//                .retrieve()
//                .bodyToMono(UserDto.class)
//                .block();
//
//        MentorDto mentorDto = MentorMapper.mapToMentorDto(mentor);
//
//        APIResponseDto apiResponseDto = new APIResponseDto();
//
//        apiResponseDto.setMentor(mentorDto);
//
//        return apiResponseDto;
//    }



}
