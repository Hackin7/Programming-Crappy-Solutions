.class Ljd$c;
.super Liy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final b:Liz$a;


# instance fields
.field a:Ldl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldl<",
            "Ljd$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljd$c$1;

    invoke-direct {v0}, Ljd$c$1;-><init>()V

    sput-object v0, Ljd$c;->b:Liz$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Liy;-><init>()V

    new-instance v0, Ldl;

    invoke-direct {v0}, Ldl;-><init>()V

    iput-object v0, p0, Ljd$c;->a:Ldl;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljd$c;->c:Z

    return-void
.end method

.method static a(Lja;)Ljd$c;
    .locals 4

    new-instance v0, Liz;

    sget-object v1, Ljd$c;->b:Liz$a;

    invoke-direct {v0, p0, v1}, Liz;-><init>(Lja;Liz$a;)V

    const-class p0, Ljd$c;

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Liz;->b:Lja;

    iget-object v2, v2, Lja;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liy;

    invoke-virtual {p0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    iget-object p0, v0, Liz;->a:Liz$a;

    invoke-interface {p0}, Liz$a;->a()Liy;

    move-result-object v2

    iget-object p0, v0, Liz;->b:Lja;

    iget-object p0, p0, Lja;->a:Ljava/util/HashMap;

    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liy;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Liy;->a()V

    :cond_1
    check-cast v2, Ljd$c;

    return-object v2
.end method


# virtual methods
.method protected final a()V
    .locals 6

    invoke-super {p0}, Liy;->a()V

    iget-object v0, p0, Ljd$c;->a:Ldl;

    invoke-virtual {v0}, Ldl;->b()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Ljd$c;->a:Ldl;

    invoke-virtual {v3, v2}, Ldl;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljd$a;

    invoke-virtual {v3}, Ljd$a;->d()Lje;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljd$c;->a:Ldl;

    iget v2, v0, Ldl;->c:I

    iget-object v3, v0, Ldl;->b:[Ljava/lang/Object;

    move v4, v1

    :goto_1
    if-ge v4, v2, :cond_1

    const/4 v5, 0x0

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iput v1, v0, Ldl;->c:I

    iput-boolean v1, v0, Ldl;->a:Z

    return-void
.end method
