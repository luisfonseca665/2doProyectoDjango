from django.contrib import admin
from .models import Carrera, Materia, Alumno, Grupo, Calificacion, Profesor

admin.site.register(Carrera)
admin.site.register(Materia)
admin.site.register(Alumno)
admin.site.register(Profesor)
admin.site.register(Grupo)
admin.site.register(Calificacion)