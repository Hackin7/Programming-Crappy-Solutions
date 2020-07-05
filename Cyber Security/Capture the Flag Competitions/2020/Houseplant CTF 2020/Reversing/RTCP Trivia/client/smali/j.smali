.class final Lj;
.super Ljava/lang/Object;


# static fields
.field static a:Ljava/lang/reflect/Field;

.field static b:Z

.field static c:Ljava/lang/reflect/Field;

.field static d:Z

.field private static e:Ljava/lang/Class;

.field private static f:Z

.field private static g:Ljava/lang/reflect/Field;

.field private static h:Z


# direct methods
.method static a(Ljava/lang/Object;)V
    .locals 4

    sget-boolean v0, Lj;->f:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "android.content.res.ThemedResourceCache"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lj;->e:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not find ThemedResourceCache class"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v1, Lj;->f:Z

    :cond_0
    sget-object v0, Lj;->e:Ljava/lang/Class;

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-boolean v0, Lj;->h:Z

    if-nez v0, :cond_2

    :try_start_1
    sget-object v0, Lj;->e:Ljava/lang/Class;

    const-string v2, "mUnthemedEntries"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lj;->g:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    sput-boolean v1, Lj;->h:Z

    :cond_2
    sget-object v0, Lj;->g:Ljava/lang/reflect/Field;

    if-nez v0, :cond_3

    return-void

    :cond_3
    const/4 v0, 0x0

    :try_start_2
    sget-object v1, Lj;->g:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/LongSparseArray;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p0

    const-string v1, "ResourcesFlusher"

    const-string v2, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p0, v0

    :goto_2
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroid/util/LongSparseArray;->clear()V

    :cond_4
    return-void
.end method
