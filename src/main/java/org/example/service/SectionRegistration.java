package org.example.service;

import org.example.model.Section;

import java.util.List;

public interface SectionRegistration {
        void addSection(Section section);
        List<Section> displayAll();
    }


