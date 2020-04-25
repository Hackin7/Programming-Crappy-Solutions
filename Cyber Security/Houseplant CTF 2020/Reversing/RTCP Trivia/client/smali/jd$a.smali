.class public final Ljd$a;
.super Liu;

# interfaces
.implements Lje$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Liu<",
        "TD;>;",
        "Lje$a<",
        "TD;>;"
    }
.end annotation


# instance fields
.field final g:I

.field final h:Landroid/os/Bundle;

.field final i:Lje;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lje<",
            "TD;>;"
        }
    .end annotation
.end field

.field j:Ljd$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd$b<",
            "TD;>;"
        }
    .end annotation
.end field

.field private k:Lip;

.field private l:Lje;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lje<",
            "TD;>;"
        }
    .end annotation
.end field


# virtual methods
.method protected final a()V
    .locals 3

    sget-boolean v0, Ljd;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  Starting: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Ljd$a;->i:Lje;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lje;->c:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lje;->e:Z

    iput-boolean v1, v0, Lje;->d:Z

    return-void
.end method

.method public final a(Liv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv<",
            "-TD;>;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Liu;->a(Liv;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ljd$a;->k:Lip;

    iput-object p1, p0, Ljd$a;->j:Ljd$b;

    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Liu;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Ljd$a;->l:Lje;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljd$a;->l:Lje;

    invoke-virtual {p1}, Lje;->a()V

    const/4 p1, 0x0

    iput-object p1, p0, Ljd$a;->l:Lje;

    :cond_0
    return-void
.end method

.method protected final b()V
    .locals 3

    sget-boolean v0, Ljd;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  Stopping: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Ljd$a;->i:Lje;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lje;->c:Z

    return-void
.end method

.method final c()V
    .locals 4

    iget-object v0, p0, Ljd$a;->k:Lip;

    iget-object v1, p0, Ljd$a;->j:Ljd$b;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-super {p0, v1}, Liu;->a(Liv;)V

    const-string v2, "observe"

    invoke-static {v2}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/String;)V

    invoke-interface {v0}, Lip;->c()Lin;

    move-result-object v2

    invoke-virtual {v2}, Lin;->a()Lin$b;

    move-result-object v2

    sget-object v3, Lin$b;->a:Lin$b;

    if-eq v2, v3, :cond_1

    new-instance v2, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;

    invoke-direct {v2, p0, v0, v1}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;-><init>(Landroidx/lifecycle/LiveData;Lip;Liv;)V

    iget-object v3, p0, Landroidx/lifecycle/LiveData;->c:Ldd;

    invoke-virtual {v3, v1, v2}, Ldd;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/LiveData$a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/lifecycle/LiveData$a;->a(Lip;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot add the same observer with different lifecycles"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez v1, :cond_1

    invoke-interface {v0}, Lip;->c()Lin;

    move-result-object v0

    invoke-virtual {v0, v2}, Lin;->a(Lio;)V

    :cond_1
    return-void
.end method

.method final d()Lje;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lje<",
            "TD;>;"
        }
    .end annotation

    sget-boolean v0, Ljd;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  Destroying: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Ljd$a;->i:Lje;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lje;->d:Z

    iget-object v0, p0, Ljd$a;->j:Ljd$b;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Ljd$a;->a(Liv;)V

    iget-boolean v1, v0, Ljd$b;->b:Z

    if-eqz v1, :cond_1

    sget-boolean v1, Ljd;->a:Z

    if-eqz v1, :cond_1

    const-string v1, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  Resetting: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ljd$b;->a:Lje;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Ljd$a;->i:Lje;

    iget-object v1, v0, Lje;->b:Lje$a;

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No listener register"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v0, Lje;->b:Lje$a;

    if-eq v1, p0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attempting to unregister the wrong listener"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v1, 0x0

    iput-object v1, v0, Lje;->b:Lje$a;

    iget-object v0, p0, Ljd$a;->i:Lje;

    invoke-virtual {v0}, Lje;->a()V

    iget-object v0, p0, Ljd$a;->l:Lje;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ljd$a;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljd$a;->i:Lje;

    invoke-static {v1, v0}, Lfz;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
