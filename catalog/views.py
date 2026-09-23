from django.shortcuts import render
from django.views.generic import ListView
from .models import Alumno

class AlumnoListView(ListView):
    model = Alumno
    template_name = 'alumnos.html'