.class final Lcg$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcg;


# direct methods
.method constructor <init>(Lcg;)V
    .locals 0

    iput-object p1, p0, Lcg$a;->a:Lcg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcg$a;->a:Lcg;

    invoke-virtual {v0}, Lcg;->i()V

    return-void
.end method
